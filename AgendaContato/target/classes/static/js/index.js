$('#btEntrar').click(function (){
    let usuario = $('#spLogin').text();
    let senha = $('#spSenha').text();
    $.ajax({
        url: "/",
        method: "POST",
        data: {
            usuario: usuario,
            senha: senha
        },
        success: function(response){
            alert('deu bom!')
        },
        error: function(){
            alert('deu ruim!')
        }
    });
})