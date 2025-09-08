# DNA Sequencer

This project implements a simple **DNA Sequencer** in Java.

## 📌 Project Description
The program reconstructs a DNA molecule from a collection of DNA strands given as command-line arguments.  
It checks for overlaps between strands and merges them if a valid overlap exists (≥4 characters). Invalid strands are ignored.  

## 🚀 Usage
Compile/Run the program:
```bash
javac src/DNASequencer.java -d bin
java -cp bin DNASequencer atcggtatactg gtatactggact ggtat gactaaaaa


