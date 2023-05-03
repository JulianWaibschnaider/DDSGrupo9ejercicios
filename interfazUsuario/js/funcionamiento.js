function iniciarsesion() {
    var usuario = document.getElementById('user');
    var contrasenia= document.getElementById('pass');
    sacaroponerestilo(usuario, contrasenia);
}


function sacaroponerestilo(usuario, contra) {
    const mensajeError = document.getElementById('mensaje-error');
    if(usuario.value === '' || usuario.value === 'admin'){
        usuario.style.border= '2px solid red';
        event.preventDefault();
    }
    if(contra.value === '' || contra.value === '1234' || contra.value ==='admin' ){
        contra.style.border= '2px solid red';
        mensajeError.style.display = 'block';
        event.preventDefault();
    }
}


function cambiarestilo(){
    var usuario = document.getElementById('user');
    var contrasenia= document.getElementById('pass');
    if (usuario.value !== '' && usuario.value !== 'admin'){
        usuario.style.border= '2px solid green';
    }
    if (contrasenia.value !== '' && contrasenia.value !== '1234' && contrasenia.value !=='admin'){
        contrasenia.style.border= '2px solid green';
    }
}