$('#btCadastro').click(function (){
    let usuario = $('#spCadastro').text();
    let email = $('#spEmail').text();
    let confEmail = $('spConfEmail').text();
    let senha = $('#spSenha').text();
    let confSenha = $('#spConfSenha').text();

    if (msg != ""){
        alert(msg);
        return;
    }else{
        $.ajax({
            url: "/cadastro",
            method: "POST",
            data: {
                usuario: usuario,
                email: email,
                confEmail: confEmail,
                senha: senha,
                confSenha: confSenha
            },
            success: function(response){}
            error: function(){
                alert('Deu ruim!')
            }
        });
    }
})