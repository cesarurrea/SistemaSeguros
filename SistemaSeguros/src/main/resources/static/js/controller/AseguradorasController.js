segurosApp.controller("aseguradorasController", function($scope,
		aseguradorasService) {

	$scope.Aseguradora = {
		consecutivo : '',
		nit : '',
		nombre : '',
		contacto : '',
		telefonocontacto : '',
		observaciones : ''
	};
	
	$scope.AseguradoraSeleccionada = {};

	$scope.onloadFun = function() {
		getAseguradoras();
	}

	function getAseguradoras() {

		$scope.aseguradoras = {};

		var requestResponse = aseguradorasService.getAll();

		requestResponse.then(function(response) {
			$scope.aseguradoras = response.data;
		}, function() {

		})
	}
	;

	$scope.adicionar = function(data) {		

		if (data.consecutivo) {
			var requestResponse = aseguradorasService.update(data);

			requestResponse.then(function(response) {
				getAseguradoras();
				$('#formAseguradoraModal').modal('hide');
			}, function() {

			})

		} else {

			var requestResponse = aseguradorasService.create(data);

			requestResponse.then(function(response) {
				getAseguradoras();
			}, function() {

			})
		}

		$scope.Aseguradora = {};
		$scope.AseguradoraSeleccionada = {};

	}

	$scope.confirmUpdate = function(data) {
		$scope.AseguradoraSeleccionada = angular.copy(data);		
		$('#formAseguradoraModal').modal('show');
	}
	
	$scope.createDialog = function() {
		$scope.AseguradoraSeleccionada = {};		
		$('#formAseguradoraModal').modal('show');
	}

	$scope.confirmDelete = function(data) {
		$scope.Aseguradora = data;
		$('#EliminarModal').modal('show');

	}

	$scope.eliminar = function() {

		var requestResponse = aseguradorasService
				.destroy($scope.Aseguradora.consecutivo);

		requestResponse.then(function(response) {
			getAseguradoras();
			$('#EliminarModal').modal('hide');
		}, function() {

		})

		$scope.Aseguradora = {};

	}

});