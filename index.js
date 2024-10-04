function subtract(victories, defeats) {
    const victoriesBalancy = victories - defeats;
    let nivel;

    if (victoriesBalancy <= 10) {
        nivel = "Ferro";
    } else if (victoriesBalancy >= 11 && victoriesBalancy <= 20) {
        nivel = "Bronze";
    } else if (victoriesBalancy >= 21 && victoriesBalancy <= 50) {
        nivel = "Prata";
    } else if (victoriesBalancy >= 51 && victoriesBalancy <= 80) {
        nivel = "Ouro";
    } else if (victoriesBalancy >= 81 && victoriesBalancy <= 90) {
        nivel = "Diamante";
    } else if (victoriesBalancy >= 91 && victoriesBalancy <= 100) {
        nivel = "Lendário";
    } else if (victoriesBalancy >= 101) {
        nivel = "Imortal";
    }

    return {victoriesBalancy, nivel};

}

const victories = 330;
const defeats = 200;
const {victoriesBalancy, nivel} = subtract(victories, defeats);

console.log("O Herói tem saldo de " + victoriesBalancy + " vitórias e está no nível " + nivel);



