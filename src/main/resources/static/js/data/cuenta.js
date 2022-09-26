$(document).ready(function(){
	cargarCuentas();
	$('#cuentas').DataTable();
});

async function cargarCuentas(){
	const request = await fetch('http://localhost:8080/api/cuenta',{
		method: 'GET',
		headers: {
			'Accept':'application/json',
			'Content-Type':'application/json'
		}
	});
	const cuenta = await request.json();

	let listadoHtml = '';
	for(let item of cuenta){
		let usuarioHtml = '<tr><td>' +
		item.id + '</td><td>' +
		item.nombre + '</td><td>' +
		item.numeroDocumento + '</td><td>' +
		item.numeroCuenta + '</td><td>' +
		item.cupo + '</td><td><a href="#" class="btn btn-danger btn-circle btn-group-sm"><li><i class="fa-duotone fa-square-pen"></i></li></a>' +
		'</td><td><a href="#" class="btn btn-danger btn-circle btn-group-sm"><li><i class="fa-duotone fa-trash"></i></li></a>' +
		'</td><td><a href="#" class="btn btn-danger btn-circle btn-group-sm"><li><i class="fa-duotone fa-notebook"></i></li></a></td></tr>';
		listadoHtml += usuarioHtml;
	}

	document.querySelector('#cuentas tbody').outerHTML = listadoHtml;

	console.log(cuenta);
}