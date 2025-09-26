# OpenClApp

A high-performance JavaFX application with **OpenCL** integration for GPU-accelerated computations and interactive visualization.

## Description

OpenClApp demonstrates how to perform high-performance computations using OpenCL directly from Java code. The application features a modern JavaFX GUI that interfaces with OpenCL kernels for parallel processing on GPUs, accelerators, or multi-core CPUs. It provides real-time visualization of computation results and supports both linear and parallel processing modes.

## Getting Started

### Prerequisites
- **JDK 16+** (configured for Java 16)
- **OpenCL-compatible device** (GPU/CPU) with proper drivers installed
- **Maven** (or use the included Maven Wrapper)
- **OpenCL drivers** for your hardware (Intel, NVIDIA, AMD)

### Installation

1. **Clone the repository**
```bash
git clone https://github.com/Zhuldyz-S/OpenClApp.git
cd OpenClApp
```

2. **Build the application**
```bash
# Using Maven Wrapper (recommended)
./mvnw clean package   # Unix/macOS/Linux
mvnw.cmd clean package # Windows

# Or using system Maven
mvn clean package
```

### Running Locally

**Option 1: Run with JavaFX Maven Plugin**
```bash
mvn javafx:run
```

**Option 2: Run compiled JAR**
```bash
java -jar out/artifacts/Disser_jar/YourAppName.jar
```

**Option 3: Run from target directory**
```bash
java -jar target/Disser-1.0-SNAPSHOT.jar
```

## Project Structure

```
OpenClApp/
├── src/main/java/
│   └── com/example/disser/
│       ├── HelloApplication.java    # Main application entry point
│       ├── FirstController.java     # Main menu controller
│       ├── HelloController.java     # Results display controller
│       └── OpenWindow.java          # Navigation utility
├── src/main/resources/
│   ├── com/example/disser/          # FXML UI files
│   └── init/                        # HTML visualization files
├── core/OpenCLCLCalc-master/        # OpenCL computation engine
│   └── PerfomanceProduction/        # C++ executables and kernels
├── pom.xml                          # Maven configuration
└── mvnw, mvnw.cmd                   # Maven Wrapper scripts
```

## Important Notes

- **Platform Dependency**: The application currently executes Windows-specific OpenCL executables. Cross-platform deployment requires adapting the executable paths in `HelloApplication.java`.
- **OpenCL Integration**: Communication between Java and OpenCL happens via external process execution rather than JNI bindings.
- **GUI Framework**: Built with JavaFX 17.0.2, requires proper JavaFX runtime configuration.
- **Module System**: Uses Java modules as defined in `module-info.java`.

## Development

**Run tests**
```bash
mvn test
```

**Clean build**
```bash
mvn clean compile
```

## Technology Stack

- **GUI**: JavaFX 17.0.2 with FXML
- **Build Tool**: Maven with Java 16
- **Testing**: JUnit 5.8.2
- **Compute Engine**: OpenCL (external C++ executables)
- **Architecture**: Java Modules System

