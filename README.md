# Multi-Agent-Resource-Management-System-for-Hotel-Selection


This project implements a **multi-agent system (MAS) for resource management** using JADE. The system enables multiple agents to communicate and collaborate to manage resources efficiently. At the final stage, the system selects the best hotel based on the user's preferences and requirements.

## Features
- **Multi-Agent Communication**: Agents exchange information to optimize resource management.
- **Resource Allocation & Management**:
  - Agents handle different tasks such as hotel data retrieval, user preference analysis, and decision-making.
  - Distributed resource allocation for efficiency.
- **Hotel Selection Process**:
  - Agents analyze hotels based on user preferences (price, location, ratings, amenities, etc.).
  - The best hotel is selected after comparing all available options.
- **Dynamic Decision-Making**: The system adapts to real-time resource availability and user requests.

## Technologies Used
- **JADE (Java Agent DEvelopment Framework)** for agent-based communication.
- **Java & JADE Behaviors** for structured agent interactions.
- **HTML Parsing** for hotel data extraction.
- **Database (optional)** for storing and retrieving hotel and user data.

## Installation & Usage
### Prerequisites
- Java (JDK 8 or later)
- JADE Framework
- Jsoup (for HTML parsing, if needed)

### Steps to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/resource-management-agent.git
   ```
2. Navigate to the project directory:
   ```bash
   cd resource-management-agent
   ```
3. Compile the Java files:
   ```bash
   javac -cp jade.jar:. src/*.java
   ```
4. Run the JADE platform:
   ```bash
   java -cp jade.jar:. jade.Boot -gui
   ```
5. Start the agents:
   ```bash
   java -cp jade.jar:. src.MainAgent
   ```

## Future Enhancements
- Integration with hotel booking APIs
- Advanced AI-driven user preference analysis
- Enhanced real-time agent coordination

## License
This project is licensed under the MIT License.

## Contact
For any questions or contributions, please contact [your email or GitHub profile].

