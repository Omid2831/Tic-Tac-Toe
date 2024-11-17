# Tic Tac Toe Game 🎮

This is a **native Java** implementation of the classic **Tic Tac Toe** game. The game features a graphical user interface (GUI) built using `Swing`, offering smooth gameplay with automatic win/draw detection.

---

## 🖼️ Demo
### Gameplay Example:


[![Gameplay Screenshot](capture/pic.png)](capture/Demo.mp4)
## 🖼️ Demo
### Gameplay Example:
[![Gameplay Screenshot](capture/pic.png)](https://www.youtube.com/capture/Demo.mp4)
> *Click the image above to watch the gameplay video.*

> *Click the image above to watch the gameplay video.*
## ✨ Features

- **Two-player gameplay**: Play with friends using classic Tic Tac Toe rules.
- **GUI built with Swing**: Intuitive interface for quick interactions.
- **Dynamic game logic**: The game checks for winners and draws automatically.
---

## 🚀 How to Run

### Prerequisites
- [**Java Development Kit (JDK)**](https://www.oracle.com/java/technologies/downloads/) installed (version 8 or higher)

### Clone the Repository
1. Open your terminal and clone the repository:
```bash
git clone https://github.com/Omid2831/Tic-tac-toe.git
```
2. Navigate into the project directory:
```bash
cd Tic-tac-toe
```
### Compile and Run
1. Compile the source files and place the compiled classes in the `bin` directory:
``` bash
javac -d bin *.java
```
3. Run the program:
```bash
java -cp bin main
```
(Please make sure main.java is your program's entry point.)  
---
### 🛠️ File Structure
  <pre>
📂 Tic-tac-toe
 ├── main.java            # Main entry point of the application
 ├── TikTakToe.java       # Game logic and GUI implementation
 ├── main.class           # Compiled bytecode for main
 ├── TikTakToe.class      # Compiled bytecode for game logic
 ├── 📂 capture
 │    ├── CapMyVid.mp4      # Gameplay video
 │    └── pic.png         # Screenshot of the game
    </pre>
---
## 🧑‍💻 How It Works

The game operates as follows:

1. **Game Setup**
   - The game is played on a 3x3 grid.
   - Two players take turns to mark their respective symbols (`X` or `O`).

2. **Gameplay**
   - The GUI dynamically updates to reflect each player's move.
   - Players alternate turns until a win, draw, or loss condition is met.

3. **Game Result Detection**
   - The program checks for the following outcomes:
     - **Wins**:
       - Three aligned marks (horizontally, vertically, or diagonally).
     - **Loss**:
       - The other player achieves three aligned marks.
     - **Draws**:
       - The board is full, and no player has achieved three aligned marks.

4. **Feedback**
   - The GUI highlights:
     - Winning cells if a player wins.
     - A message indicates the game result (win, loss, or draw).
---



