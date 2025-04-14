document.addEventListener("DOMContentLoaded", () => {
    const dice = document.getElementById("dice");
    const rollBtn = document.getElementById("rollBtn");
    const turnText = document.getElementById("turn");
    const winnerText = document.getElementById("winner");
    const startGameBtn = document.getElementById("startGame");

    const scores = [0, 0, 0, 0];
    let currentPlayer = 0;
    const WINNING_SCORE = 40;
    const diceImages = [
        "images/dice1.png", "images/dice2.png", "images/dice3.png",
        "images/dice4.png", "images/dice5.png", "images/dice6.png"
    ];

    function updateProgress() {
        for (let i = 0; i < 4; i++) {
            let progress = Math.min((scores[i] / WINNING_SCORE) * 100, 100);
            document.getElementById(`progress${i + 1}`).style.width = `${progress}%`;
        }
    }

    function rollDice() {
        if (winnerText.textContent !== "") return;

        dice.classList.add("rolling");

        setTimeout(() => {
            let randomNum = Math.floor(Math.random() * 6) + 1;
            dice.src = diceImages[randomNum - 1];
            scores[currentPlayer] += randomNum;
            document.getElementById(`score${currentPlayer + 1}`).textContent = scores[currentPlayer];
            updateProgress();

            if (scores[currentPlayer] >= WINNING_SCORE) {
                winnerText.textContent = `🏆 ${document.getElementById(`playerName${currentPlayer + 1}`).textContent} Wins! 🎉`;
                rollBtn.disabled = true;
                return;
            }

            currentPlayer = (currentPlayer + 1) % 4;
            turnText.textContent = `${document.getElementById(`playerName${currentPlayer + 1}`).textContent}'s Turn`;

            dice.classList.remove("rolling");
        }, 600);
    }
    startGameBtn.addEventListener("click", function() {
        let names = [];
        for (let i = 1; i <= 4; i++) {
            let nameInput = document.getElementById(`name${i}`).value.trim();
            if (nameInput === "") {
                alert("Please enter all player names!");
                return;
            }
            names.push(nameInput);
        }
        for (let i = 1; i <= 4; i++) {
            document.getElementById(`playerName${i}`).textContent = names[i - 1];
        }
        document.getElementById("name-inputs").style.display = "none";
        document.getElementById("game-content").style.display = "block";
    });

    dice.addEventListener("click", rollDice);
    rollBtn.addEventListener("click", rollDice);
});
