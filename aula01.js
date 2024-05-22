var QG = prompt("Digite a quantidade de Gols");
var PC = prompt("Digite a quantidade de passes certos");
var PE = prompt("Digite a quantidade de passes errados");

var PT = (QG *50) + (PC * 10) + (PE * -5);

if (PT < 50){
   document.write("Pessima Partida"); 
}else if (PT >= 50 && PT < 100){
    document.write("Partida Ruim");
}else if (PT >= 100 && PT <150){
    document.write("Fez o Básico");
}else if (PT >= 150 && PT <200){
    document.write("Foi bem na Partida");
}else{
    document.write("Jogou Demais");
}


