
app.controller("TeamProfileController", function($scope, $http, $routeParams)
{
	
	var coach = { name:'Fred', lastName:'Hoiberg', birthdate:'12 de Enero 1989' };
	var bio = 'es un equipo de baloncesto profesional de la NBA con sede en Chicago, Illinois, fundado en 1966. Es el tercer equipo profesional con sede en esta ciudad tras Chicago Packers/Zephyrs y Chicago Stags, equipo que participó en los años 1940 en la BAA, antigua denominación de la liga profesional norteamericana de baloncesto.';
	var player1 = {oid:1, name:'Juan Francisco', lastName:'Maldonado', number:23, position:'SHOOTING_GUARD', image:'jordan.jpg'};
	var player2 = {oid:1, name:'Scottie', lastName:'Pipen', number:33, position:'POWER_FORWARD', image:'pipen.jpg'};
	var player3 = {oid:1, name:'Juan Francisco', lastName:'Maldonado', number:23, position:'SHOOTING_GUARD', image:'jordan.jpg'};
	var player4 = {oid:1, name:'Scottie', lastName:'Pipen', number:33, position:'POWER_FORWARD', image:'pipen.jpg'};
	var player5 = {oid:1, name:'Juan Francisco', lastName:'Maldonado', number:23, position:'SHOOTING_GUARD', image:'jordan.jpg'};
	var player6 = {oid:1, name:'Scottie', lastName:'Pipen', number:33, position:'POWER_FORWARD', image:'pipen.jpg'};
	var player7 = {oid:1, name:'Juan Francisco', lastName:'Maldonado', number:23, position:'SHOOTING_GUARD', image:'jordan.jpg'};
	var player8 = {oid:1, name:'Scottie', lastName:'Pipen', number:33, position:'POWER_FORWARD', image:'pipen.jpg'};
	var players = [player1,player2,player3,player4,player5,player6,player7,player8];
//	$scope.team = {oid:1, name:"Chicago Bulls", bio:bio,gender:'MALE', description:'', category:'ADULT', image:'cbulls.png', 
//			playeers:[player1,player2,player3,player4,player5,player6,player7,player8], coach:coach};
//	
//	
	
	$scope.flagLoading = true;
	
	$scope.loadData = function(  )
	{
		$scope.flagLoading = true;
		NProgress.configure({ parent: '#main' });
		NProgress.start();
		
		var request = 
		$http.get( CONSTANTS.contextPath + "/services/teams/" + $routeParams.id );
		request.success( function( response )
		{
			$scope.team = response;
//			$scope.team.players = players; //TODO: REMOVE
//			$scope.team.coach = coach;//TODO: REMOVE
			
			$scope.flagLoading = false;
			NProgress.done();
		} );
		request.error( function( error )
		{
			alert( error );
			$scope.flagLoading = false;
			NProgress.done();
		});
	};
	
	
	$scope.loadData();
	
	
	
});