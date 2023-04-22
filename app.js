/*// Obtener las respuestas de un formulario de Google usando la API de Google Forms y JavaScript puro

// ID del formulario de Google
var formId = "1FAIpQLSeo6YbYqNmaxQgdHcUVrGoG72WkT0feiSW-7yA7F5cPD4Ly6A";

// Autenticación de Google
gapi.load("auth2", function() {
  gapi.auth2.init({
    client_id: "790024887155-bjiviv0pulpuomaebviv24p9659gnnbm.apps.googleusercontent.com",
  }).then(function(auth2) {
    auth2.signIn().then(function() {
      // Token de acceso de OAuth
      var token = auth2.currentUser.get().getAuthResponse().access_token;

      // Solicitar las respuestas del formulario de Google
      var xhr = new XMLHttpRequest();
      xhr.open("GET", "https://docs.google.com/forms/d/" + formId + "/responses?alt=json&access_token=" + token, true);
      xhr.onreadystatechange = function() {
        if (xhr.readyState === 4 && xhr.status === 200) {
          var response = JSON.parse(xhr.responseText);
          console.log(response); // Aquí se muestra la respuesta del formulario de Google
        }
      };
      xhr.send();
    });
  });
});*/