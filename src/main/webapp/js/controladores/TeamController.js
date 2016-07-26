
app.controller("TeamController", function($scope, $http, $location){
	
	
	$scope.teams = [];
	$scope.flagLoading = false;
	$scope.flagErrorLoading = false;
	
	
	
	/**
	 * 
	 */
	$scope.loadData = function(  )
	{
		$scope.flagLoading = true;
		NProgress.configure({ parent: '#main' });
		NProgress.start();
		
		var request = 
		$http.get( CONSTANTS.contextPath + "/services/teams" );
		request.success( function( response )
		{
			$scope.teams = response;
			$scope.flagLoading = false;
			NProgress.done();
		} );
		request.error( function( error )
		{
			$scope.flagLoading = false;
			$scope.flagErrorLoading = true;
			NProgress.done();
		});
	};
	
	
	$scope.loadData();
	
	
});