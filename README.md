# DNA Sequencer

A lightweight Java program that simulates a **DNA Sequencer**.  
The application takes a collection of DNA strands as input and reconstructs the longest possible DNA molecule by identifying and merging valid overlaps between strands.

---

## Project Explanation
A DNA strand can be represented as a sequence of nucleotides (`A`, `C`, `G`, `T`). This project demonstrates how computational techniques can be applied to reconstruct a DNA molecule from fragmented strands.

The program:
1. Accepts a list of DNA strands as command-line arguments.
2. Validates the input strands (rejecting those containing invalid characters).
3. Chooses the first valid strand as the base sequence.
4. Iteratively checks each subsequent strand for overlap with the growing DNA molecule.
5. Merges the strand into the sequence if a valid overlap of **4 or more nucleotides** is found.
6. Ignores strands that do not overlap.

The result is a single DNA sequence representing the merged molecule.

This project illustrates:
- Input validation
- String processing using character indexing
- Iterative merging of sequences
- A practical application of algorithmic problem-solving

---

## Repository Structure
DNA-Sequencer/
 ┣  src/          # Source code (Java)
 ┣  bin/          # Compiled .class files
 ┣  .gitignore    # Ignore IDE/build artifacts
 ┣  LICENSE       # MIT open-source license
 ┣  README.md     # Project documentation

---

## Features:
- Command-line interface
- Robust input validation
- DNA sequence reconstruction
- Efficient string overlap checking
- Lightweight and dependency-free

---

## Technologies:
- Language: Java
- Paradigm: Procedural + basic string manipulation
- Tools: Any Java-compatible IDE (Eclipse, IntelliJ, VS Code)

---

## Author:
-Developed by Nicolas Constantinou
-2025

## Usage

### Compile/Run:
```bash
javac src/DNASequencer.java -d bin
java -cp bin DNASequencer atcggtatactg gtatactggact ggtat gactaaaaa

