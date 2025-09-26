# OpenClApp

[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](#license)

A Java application with **OpenCL** integration — a tool for computations using OpenCL (GPUs, accelerators, or CPUs).

---

## 🧩 About

**OpenClApp** demonstrates how to perform high-performance computations with **OpenCL** directly from Java code.  
It includes the OpenCL core, a wrapper for context/buffer management, and computation examples.

---

## 📁 Project Structure

OpenClApp/
├── core/
│ └── OpenCLCLCalc-master/ # OpenCL library / core
├── out/
│ └── artifacts/
│ └── Disser_jar # build artifacts
├── src/
│ └── main/ # main Java sources
├── .gitignore
├── pom.xml # Maven build file
├── mvnw / mvnw.cmd # Maven Wrapper scripts
└── README.md # this file


- `core/OpenCLCLCalc-master/` — OpenCL core code  
- `src/main/` — Java source code  
- `out/artifacts/` — compiled JARs / artifacts  
- `pom.xml` — Maven build configuration  
- `mvnw`, `mvnw.cmd` — Maven Wrapper (no need to install Maven globally)  

---

## 📥 Installation & Build

### Requirements
- JDK 8+  
- OpenCL-compatible device (GPU/CPU) with proper drivers  
- Maven (or use the included Maven Wrapper)  

### Clone the repository
```bash
git clone https://github.com/Zhuldyz-S/OpenClApp.git
cd OpenClApp


mvn clean package
./mvnw clean package   # Unix / macOS / Linux
mvnw.cmd clean package  # Windows


java -jar path/to/built-file.jar


java -jar out/artifacts/Disser_jar/YourAppName.jar

