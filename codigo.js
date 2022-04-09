$(document).ready(function(){
    class animacionEstiloSlide {

        constructor(el) {
          //Almacenar elementos(tags)
          this.el = el;
          this.summary = el.querySelector('summary');
          this.content = el.querySelector('.content');

          this.animation = null;
          //Alamcenar si esta abriendo o cerrando el details
          this.isClosing = false;
          this.isExpanding = false;
          //Detectar clicks
          this.summary.addEventListener('click', (e) => this.onClick(e));
        }
      
        onClick(e) {
          //Previene que el details se abra como lo hace por defecto
          e.preventDefault();
          // Evitar desborde
          this.el.style.overflow = 'hidden';

          if (this.isClosing || !this.el.open) {
            this.abrir();
          } 
          else if (this.isExpanding || this.el.open) {
            this.cerrar();
          }
        }
      
        cerrar() {
          //Alamacenar q se esta cerrando
          this.isClosing = true;
          
          // Almacenar el alto del elemento en el momento
          const startHeight = `${this.el.offsetHeight}px`;
          // Calcular alto del contenido
          const endHeight = `${this.summary.offsetHeight}px`;
          
          // Se fija si ya esta pasando alguna animacion
          if (this.animation) {
            this.animation.cancel();
          }
          
          // Iniciar la animacion
          this.animation = this.el.animate({
            // Fijar los cuadros clave para la animacion
            height: [startHeight, endHeight]
          }, {
            duration: 400,
            easing: 'ease-out'
          });
          
          this.animation.onfinish = () => this.onAnimationFinish(false);
          this.animation.oncancel = () => this.isClosing = false;
        }
      
        abrir() {
          // Apply a fixed height on the element
          this.el.style.height = `${this.el.offsetHeight}px`;
          // Force the [open] attribute on the details element
          this.el.open = true;
          // Wait for the next frame to call the expand function
          window.requestAnimationFrame(() => this.expand());
        }
      
        expand() {
          // Set the element as "being expanding"
          this.isExpanding = true;
          // Get the current fixed height of the element
          const startHeight = `${this.el.offsetHeight}px`;
          // Calculate the open height of the element (summary height + content height)
          const endHeight = `${this.summary.offsetHeight + this.content.offsetHeight}px`;
          
          // If there is already an animation running
          if (this.animation) {
            // Cancel the current animation
            this.animation.cancel();
          }
          
          // Start a WAAPI animation
          this.animation = this.el.animate({
            // Set the keyframes from the startHeight to endHeight
            height: [startHeight, endHeight]
          }, {
            duration: 400,
            easing: 'ease-out'
          });
          // When the animation is complete, call onAnimationFinish()
          this.animation.onfinish = () => this.onAnimationFinish(true);
          // If the animation is cancelled, isExpanding variable is set to false
          this.animation.oncancel = () => this.isExpanding = false;
        }
      
        onAnimationFinish(open) {
          // Set the open attribute based on the parameter
          this.el.open = open;
          // Clear the stored animation
          this.animation = null;
          // Reset isClosing & isExpanding
          this.isClosing = false;
          this.isExpanding = false;
          // Remove the overflow hidden and the fixed height
          this.el.style.height = this.el.style.overflow = '';
        }
      }
      
      document.querySelectorAll('details').forEach((el) => {
        new animacionEstiloSlide(el);
      });



    $("iframe").toggle();

    //Ej1:
    $("#mostrarMainEj1").click(function(){
      $("#mainEj1").slideToggle();
    })
    $("#mostrarPersonEj1").click(function(){
      $("#personEj1").slideToggle();
    })

    //Ej2:
    $("#mostrarMainEj2").click(function(){
      $("#mainEj2").slideToggle();
    })
    $("#mostrarPersonaEj2").click(function(){
      $("#personaEj2").slideToggle();
    })

    //Ej3:
    $("#mostrarMainEj3").click(function(){
      $("#mainEj3").slideToggle();
    })
    $("#mostrarProductoEj3").click(function(){
      $("#ProductoEj3").slideToggle();
    })

    //Ej4:
    $("#mostrarMainEj4").click(function(){
      $("#mainEj4").slideToggle();
    })
    $("#mostrarPersonasEj4").click(function(){
      $("#PersonasEj4").slideToggle();
    })
    $("#mostrarSistemaEj4").click(function(){
      $("#SistemaEj4").slideToggle();
    })

    //Ej5:
    $("#mostrarMainEj5").click(function(){
      $("#mainEj5").slideToggle();
    })

    //Ej6:
    $("#mostrarMainEj6").click(function(){
      $("#mainEj6").slideToggle();
    })
    $("#mostrarPersonasEj6").click(function(){
      $("#PersonasEj6").slideToggle();
    })
    $("#mostrarSistemaEj6").click(function(){
        $("#SistemaEj6").slideToggle();
    })

    //Ej7:
    $("#mostrarMainEj7").click(function(){
      $("#mainEj7").slideToggle();
    })
    $("#mostrarLibroEj7").click(function(){
      $("#LibroEj7").slideToggle();
    })
    $("#mostrarSistemaEj7").click(function(){
      $("#SistemaEj7").slideToggle();
    })
    $("#mostrarClienteEj7").click(function(){
      $("#ClienteEj7").slideToggle();
    })

    //Ej8:
    $("#mostrarMainEj8").click(function(){
      $("#mainEj8").slideToggle();
    })
    $("#mostrarFechaEj8").click(function(){
      $("#fechaEj8").slideToggle();
    })

    //Ej9:
    $("#mostrarMainEj9").click(function(){
      $("#mainEj9").slideToggle();
    })
    $("#mostrarArraysEj9").click(function(){
      $("#arraysEj9").slideToggle();
    })

    //Ej10:
    $("#mostrarMainEj10").click(function(){
      $("#mainEj10").slideToggle();
    })
    $("#mostrarPersonaEj10").click(function(){
      $("#personaEj10").slideToggle();
    })
    $("#mostrarHijoEj10").click(function(){
      $("#hijoEj10").slideToggle();
    })
    $("#mostrarMadreEj10").click(function(){
      $("#madreEj10").slideToggle();
    })

    //Ej11:
    $("#mostrarMainEj11").click(function(){
      $("#mainEj11").slideToggle();
    })
    $("#mostrarPersonaEj11").click(function(){
      $("#personaEj11").slideToggle();
    })
    $("#mostrarAlumnoEj11").click(function(){
      $("#alumnoEj11").slideToggle();
    })
    $("#mostrarPlatoEj11").click(function(){
      $("#platoEj11").slideToggle();
    })
    $("#mostrarPedidoEj11").click(function(){
      $("#pedidoEj11").slideToggle();
    })
    $("#mostrarSistemaAlmuerzoEj11").click(function(){
      $("#sistemaAlmuerzoEj11").slideToggle();
    })
})