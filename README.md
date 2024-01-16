# Patient Record Management System

![PRMS Logo](path/to/logo.png)

Welcome to the Patient Record Management System (PRMS) repository! This project is designed to streamline the management of patient medical records within healthcare institutions. The system aims to enhance the efficiency of recording, storing, and retrieving patient health information, ultimately contributing to the improvement of healthcare services' quality.

## Mission Objective

The primary goal of PRMS is to develop an efficient database system that ensures data accuracy and accessibility. By providing a comprehensive solution for managing patient records, the system aims to address critical business problems within healthcare management, including improving patient care, data accuracy, legal compliance, and financial efficiency.

## Entities of ER Diagram

The system incorporates various entities to address specific aspects of patient records and healthcare management. These entities include:

- **Patient:** Represents individuals seeking healthcare services.
- **Consent Form:** Ensures legal and ethical considerations by obtaining informed consent for medical procedures and data sharing.
- **Emergency Contact:** Facilitates quick communication with a patient's designated emergency contact during critical health events.
- **Appointment:** Manages and schedules patient appointments effectively.
- **Physician:** Oversees healthcare professionals, their specialties, and schedules for efficient healthcare delivery.
- **Specialty:** Stores information about medical specialties to categorize and identify physician specialties.
- **Insurance Policy:** Handles information about insurance policies held by patients, aiding in billing and claims processing.
- **Medical Records:** Stores comprehensive patient health histories, enabling informed decision-making and progress tracking.
- And more...

## Entity Relations

The relationships between entities are well-defined to ensure seamless interactions and data flow. Examples include the association between Medical Records and Lab Tests, Medical Records and Billings, Medical Record and Immunization, and many others.

## Getting Started

Follow these steps to get started with the Patient Record Management System:

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/patient-record-management.git
   ```

2. Navigate to the project directory:
   ```bash
   cd patient-record-management
   ```

3. Open the project in your preferred Integrated Development Environment (IDE).

4. Install the required dependencies:
   ```bash
   npm install
   ```

5. Set up your database using the provided SQL script (`database_setup.sql`).

6. Update the database configuration in the project to match your local environment.

7. Run the application:
   ```bash
   npm start
   ```

8. Access the application in your browser at `http://localhost:3000`.

## Contribution Guidelines

We welcome contributions to enhance and improve the Patient Record Management System. To contribute:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Make your changes and commit them.
4. Push your changes to your fork.
5. Submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).

Feel free to explore the code, contribute to the project, and help us create a more efficient and effective patient record management system! If you have any questions or concerns, please open an issue or reach out to the project maintainers. Thank you for your interest and contribution.
