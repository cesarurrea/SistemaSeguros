segurosApp.service('clientesService', function($http) {
	$this.getAll = function() {
		var request = $http({
			method : 'GET',
			url : '/servicios/clientes'
		});
		return request;
	}

	$this.create = function(aseguradora) {
		var request = $http({
			method : 'PUT',
			url : '/servicios/clientes',
			data : JSON.stringify(aseguradora),
			dataType : "json"
		});
		return request;
	}

	$this.update = function(aseguradora) {
		var request = $http({
			method : 'POST',
			url : '/servicios/clientes',
			data : JSON.stringify(aseguradora),
			dataType : "json"
		});
		return request;
	}

	$this.destroy = function(id) {
		var request = $http({
			method : 'DELETE',
			url : '/servicios/clientes' + id
		});
		return request;

	}

})