$(document).ready(function(){
    $(".Inputs").hide();

    $("#mostrarInputs").click(function(){
        $(".Inputs").show();
    })

    $("#ingresar").click(function(){

        let tabla = document.getElementById("tabla");
        let fila = document.createElement("tr");
        let celda1 = document.createElement("td");
        let celda2 = document.createElement("td");
        let celda3 = document.createElement("td");
        
        celda1.append(document.getElementById("Campo1").value);
        celda2.append(document.getElementById("Campo2").value);
        celda3.append(document.getElementById("Campo3").value);

        fila.append(celda1);
        fila.append(celda2);
        fila.append(celda3);
        tabla.append(fila);

        $(".Inputs").hide();

        document.getElementById("Campo1").value = "";
        document.getElementById("Campo2").value = "";
        document.getElementById("Campo3").value = "";
    })
})