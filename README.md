# EcommerceApp – Servlet Based Product Billing Application

This project is a simple Java Servlet-based web application that takes product 
details from a user (name, quantity, and price per unit), calculates the total 
price, applies a discount based on the amount, and displays the final price.

This project is built using:
- Java 17+ / Java 24  
- Apache Tomcat 10  
- Maven  
- Jakarta Servlet API  
- IntelliJ IDEA Community Edition (manual Tomcat deployment)

---

## ✅ Project Features

- HTML form to accept product details  
- Servlet processes input using POST method  
- Automatically calculates:
  - Total price (`quantity × price`)
  - Discount based on total amount
  - Final payable amount  
- Dynamic HTML response with summary

---

## ✅ Discount Rules

| Total Amount     | Discount |
|------------------|----------|
| ₹0 – ₹999        | 0%       |
| ₹1000 – ₹4999    | 10%      |
| ₹5000+           | 20%      |

---
