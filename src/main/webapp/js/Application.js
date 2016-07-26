var app = angular.module('App', ['ngRoute']).config(function($routeProvider, $controllerProvider) 
{
	app.registerCtrl = $controllerProvider.register;
	$routeProvider
    .when('/', 
    {
    	controller:'DashboardController',
    	templateUrl: 'inicio.html' 	
    })
    
    .when('/teams',{controller:'TeamController',templateUrl: 'pages/teams/teams.html'})
    .when('/team/create',{controller:'TeamCreateController',templateUrl:  'pages/teams/team-create.html'})
    .when('/team/:id',{controller:'TeamProfileController',templateUrl:  'pages/teams/team-profile.html'})
    .when('/team/edit/:id',{controller:'TeamEditController',templateUrl:  'pages/teams/team-edit.html'})
    .when('/team/:id/players/add',{controller:'PlayerCreateController',templateUrl:  'pages/teams/team-add-player.html'})
    .when('/team/:id/players/:idPlayer/edit',{controller:'PlayerEditController',templateUrl:  'pages/teams/team-edit-player.html'})
    
    .when('/canchas',{controller:'CanchaController',templateUrl: 'pages/canchas/canchas.html'})
    .when('/canchas/create',{controller:'CanchaCrearController',templateUrl: 'pages/canchas/crearCancha.html'})
    .when('/canchas/editarCancha/:id',{controller:'CanchaEditarController',templateUrl: 'pages/canchas/editarCancha.html'})
    
    .when('/player/:id',{controller:'PlayerProfileController',templateUrl:  'pages/players/player-profile.html'})
    .when('/players',{controller:'PlayerController',templateUrl:  'pages/players/players.html'})
    .when('/players/create',{controller:'PlayerCreateController',templateUrl:  'pages/teams/team-add-player.html'})
    
    .when('/matches',{controller:'MatchController',templateUrl:  'pages/matches/matches.html'})
    .when('/matches/create',{controller:'MatchCreateController',templateUrl:  'pages/matches/match-create.html'})
    
    .when('/administracion/usuarios',{controller:'UsuarioController',templateUrl:  'pages/administracion/usuarios/usuarios.jsp'})
    .otherwise(
    {
    	redirectTo:'/'
    });
	
});


app.controller("DashboardController", function($scope, $http, $location)
{
	
	$scope.ref = function( link ){
		$location.url( link );
	};
	
});