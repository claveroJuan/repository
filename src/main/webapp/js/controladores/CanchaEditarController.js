app.controller("CanchaEditarController", function($scope, $http, $routeParams)
{
	

	var player1 = {oid:1, name:'bart', lastName:'simpson', number:10, position:'DELANTERO', image:'neymar.jpg'};

//	var players = [player1,player2,player3,player4,player5,player6,player7,player8];
//	$scope.team = {oid:1, name:"Chicago Bulls", bio:bio,gender:'MALE', description:'', category:'ADULT', image:'cbulls.png', 
//			players:[player1,player2,player3,player4,player5,player6,player7,player8], coach:coach};
//	
//	
//	$scope.searchPlayers = [player1,player2,player3,player4,player5,player6,player7,player8];
	
	
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
		$http.get( CONSTANTS.contextPath + "/services/Canchas/" + $routeParams.id );
		request.success( function( response )
		{
			$scope.Canchas = response;
//			$scope.team.players = players; //TODO: REMOVE
			
			$scope.flagLoading = false;
			NProgress.done();
			
			setTimeout(function(){
				
				$(".list-group-item.edit").click( function(){
					$(".list-group-item .actions").each( function(){ $(this).hide(); } );
					$(".list-group-item .badge").each( function(){ $(this).show(); } );
					$(this).find( "div.actions" ).show();
					$(this).find( "span.badge" ).hide();
				} );
				
			}, 1000);
			
			
			
			
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