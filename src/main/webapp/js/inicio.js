/**
 * 
 */

function getLocation()
{
	if( navigator.geolocation ){
		navigator.geolocation.getCurrentPosition( showPosition );
	}else{
		console.log( "La localizacion no esta disponible" );
	}
}

function showPosition( position )
{
	console.log( position.coords.latitude );
	console.log( position.coords.longitude );
}

getLocation();


function changeInput(){
	var value = document.getElementById("inputUsuario").value;
	document.getElementById("result-input").innerHTML = "Texto : "+ value;
	console.log("sdsd");
}

document.getElementById("inputUsuario").addEventListener("keydown", changeInput);



function  validarDatos()
{
	if( $("#inputUsuario").val()=="" && 
	$("#inputPassword").val()=="" )
	{
		$("#result-input").html( "Ingrese usuario y password" );
		$("#result-input").attr("class", "alert alert-danger");
		return false;
	}
}