segurosApp.service('aseguradorasService', function($http) {	
	$this = this;
	
	$this.getAll = function() {
		var request = $http({
			method : 'GET',
			url : '/services/aseguradoras'
		});
		return request;
	}

	$this.create = function(aseguradora) {
		var request = $http({
			method : 'PUT',
			url : '/services/aseguradoras',
			data : JSON.stringify(aseguradora),
			dataType : "json"
		});
		return request;
	}
	
	$this.update = function(aseguradora) {
		var request = $http({
			method : 'POST',
			url : '/services/aseguradoras',
			data : JSON.stringify(aseguradora),
			dataType : "json"
		});
		return request;
	}

	$this.destroy = function(id) {
		var request = $http({
			method : 'DELETE',
			url : '/services/aseguradoras'+id			
		});
		return request;

	}

})