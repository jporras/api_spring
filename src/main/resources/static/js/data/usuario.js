$(document).ready(function(){
	cargarUsuarios();
	$('#usuarios').DataTable();
});

async function cargarUsuarios(){
	const request = await fetch('http://localhost:8080/api/usuario',{
		method: 'GET',
		headers: {
			'Accept':'application/json',
			'Content-Type':'application/json'
		}
	});
	const usuario = await request.json();

	let listadoHtml = '';
	for(let item of usuario){
		let usuarioHtml = '<tr><td>' +
		item.id + '</td><td>' +
		item.nombreUsuario + '</td><td>' +
		item.clave + '</td><td>' +
		item.nombres + '</td><td>' +
		item.apellidos + '</td><td><a href="#" class="btn btn-danger btn-circle btn-group-sm"><i class="bi-pencil-square"></i></a>' +
		'</td><td><a href="#" class="btn btn-danger btn-circle btn-group-sm"><i class="bi-trash"></i></a></td></tr>';
		listadoHtml += usuarioHtml;
	}

	document.querySelector('#usuarios tbody').outerHTML = listadoHtml;

	console.log(usuarios);
}