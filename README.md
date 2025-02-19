# <img src="https://media.giphy.com/media/3ov9jNziFTMfzSumAw/giphy.gif" width="65px"> Architectural Blueprints

<p>
  Welcome to the Architectural Blueprints repository! This project is an educational resource designed to provide practical, hands-on examples of essential software architecture concepts. Whether you want to dive into the core SOLID principles, explore the world of design patterns through creational, structural, and behavioral examples, or learn about microservices architecture via a real-world project, this repository has you covered.
</p>

<!-- TABLE OF CONTENTS -->
<details>
  <summary><strong>Table of Contents</strong></summary>
  <ol>
    <li><a href="#architectural-blueprints">Architectural Blueprints</a></li>
    <li><a href="#branches-and-content">Branches and Content</a></li>
    <li>
      <a href="#practical-examples">Practical Examples</a>
      <ul>
        <li><a href="#solid-principles">SOLID Principles</a></li>
        <li><a href="#design-patterns">Design Patterns</a></li>
        <li><a href="#microservices-architecture-example">Microservices Architecture Example</a></li>
      </ul>
    </li>
    <li><a href="#note">Note</a></li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#license">License</a></li>
  </ol>
</details>

## Architectural Blueprints

This repository is a comprehensive guide for software architecture enthusiasts. It serves as a practical blueprint by offering real-world examples to help you understand and implement:

- **SOLID Principles** – Simple, practical examples that illustrate each of the five SOLID principles.
- **Design Patterns** – Hands-on demonstrations covering common design patterns:
    - **Creational Patterns** (e.g., Singleton, Factory)
    - **Structural Patterns** (e.g., Facade, Decorator)
    - **Behavioral Patterns** (e.g., Observer, Strategy)
- **Microservices Architecture** – An example project built with a component-based design that leverages multiple backends (using different technologies), integrated with a Eureka server and an API Gateway in Spring Boot.

Each topic is organized into its dedicated branch, making it easy to focus on the area you need.

## Branches and Content

- **practical/SOLID**  
  Contains clear, beginner-friendly examples that demonstrate the application of SOLID principles in software design.

- **practical/DesignPatterns**  
  Features practical examples of design patterns categorized into:
    - **Creational Patterns** (e.g., Singleton, Factory)
    - **Structural Patterns** (e.g., Facade, Decorator)
    - **Behavioral Patterns** (e.g., Observer, Strategy)

- **practical/MicroserviceProject**  
  Offers a sample microservices project that demonstrates a component-based architecture using several backends built with different technologies. This project integrates a Eureka server and an API Gateway in Spring Boot, providing a clear idea of modern microservices architecture.

## Practical Examples

### SOLID Principles

- **Overview:**  
  Dive into practical examples that illustrate the Single Responsibility, Open/Closed, Liskov Substitution, Interface Segregation, and Dependency Inversion principles.
- **Accessing the Examples:**  
  Clone the SOLID branch with the following command:
  ```bash
  git clone -b practical/SOLID --single-branch https://github.com/gayanukabulegoda/Architectural-Blueprints.git
  ```

### Design Patterns

- **Overview:**  
  Explore hands-on implementations of common design patterns used in modern software development. The examples are organized into creational, structural, and behavioral categories.
- **Accessing the Examples:**  
  Clone the Design Patterns branch with the following command:
  ```bash
  git clone -b practical/DesignPatterns --single-branch https://github.com/gayanukabulegoda/Architectural-Blueprints.git
  ```

### Microservices Architecture Example

- **Overview:**  
  Explore a sample microservices project demonstrating a component-based architecture that utilizes multiple backends with different technologies. This project leverages a Eureka server and an API Gateway implemented in Spring Boot.
- **Accessing the Example:**  
  Clone the MicroserviceProject branch with the following command:
  ```bash
  git clone -b practical/MicroserviceProject --single-branch https://github.com/gayanukabulegoda/Architectural-Blueprints.git
  ```
- **Postman Collection:**  
  Test and interact with the microservices using the provided Postman request collection available [here](https://documenter.getpostman.com/view/36681432/2sAYdZutrE).

## Note

For additional reference and deeper insights, please review the updated Handwritten Note available [here](https://drive.google.com/file/d/1MRqPpGZcFVgPUZzO2i8eH8hSWDl_BLkf/view?usp=sharing).

## Usage

1. **Clone the Repository:**  
   Choose the branch that fits your interest:
    - For SOLID principles:
      ```bash
      git clone -b practical/SOLID --single-branch https://github.com/gayanukabulegoda/Architectural-Blueprints.git
      ```
    - For Design Patterns:
      ```bash
      git clone -b practical/DesignPatterns --single-branch https://github.com/gayanukabulegoda/Architectural-Blueprints.git
      ```
    - For the Microservices Project:
      ```bash
      git clone -b practical/MicroserviceProject --single-branch https://github.com/gayanukabulegoda/Architectural-Blueprints.git
      ```
2. **Explore the Code:**  
   Open the project in your preferred IDE or text editor to review the examples and accompanying documentation.
3. **Run and Experiment:**  
   Follow the instructions provided in each branch’s README or source files to run the examples, experiment with the code, and integrate the concepts into your own projects.
4. **Prerequisites:**  
   This project includes Java-based example implementations. Ensure you have the JDK (JDK 17) installed on your system.

## License

This project is licensed under the [MIT License](LICENSE).

---

<div align="center">
  <a href="https://github.com/gayanukabulegoda" target="_blank"><img src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white" alt="GitHub"></a>
  <a href="https://git-scm.com/" target="_blank"><img src="https://img.shields.io/badge/Git-100000?style=for-the-badge&logo=git&logoColor=white" alt="Git"></a>
  <a href="https://www.oracle.com/java/" target="_blank"><img src="https://img.shields.io/badge/Java-100000?style=for-the-badge&logo=openjdk&logoColor=white" alt="JDK 21"></a>
</div>

<p align="center">
  &copy; 2025 Gayanuka Bulegoda
</p>