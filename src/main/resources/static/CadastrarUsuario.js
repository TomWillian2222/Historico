$("#enviar").click(cadastrarUsuario);

function cadastrarUsuario(){
	let nome = $("#nome").val();
	let email = $("#email").val();
	let CPF = $("#CPF").val();
	let senha = $("#senha").val;
	let confirmar_senha = $("#confirmar_senha").val;

	$.ajax({
		type: "POST",
		url: "/cadastro",
		data:{
			nome:nome,
			email:email,
			CPF:CPF,
			senha:senha,
			confirmar_senha:confirmar_senha,
		},
		success:function(data){
			alert("ok");
		},
		error: function(){
			alert("Não ok");
		}
	});
}