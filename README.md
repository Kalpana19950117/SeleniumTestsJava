# SeleniumTestsJava
Selenium web browser tests in Java for amazon.com.

This project uses selenium tests in Java to:
  1. Navigate to amazon.com in the Chrome web driver.
  2. Search "Nikon" in the search bar.
  3. Sort the product list from "Price: High to Low".
  4. Select the second product on the resulting page.
  5. Check whether the product topic contains the text “Nikon D3X” with an assert.

This project is executed in macos with a Silicon Chip (M1) PC and in Chrome version 113.0.5672.127.

# Requirements
  1. Chrome webdriver needs to be downloaded according to your operating system.
  2. You need to enable assertions in your IDE.

# Steps to execute the project
  1. Clone the git repository on your PC.
  2. Check your chrome version. The executable chromedriver in this repo is only for macos with Silicon Chip (M1) and Chrome version is 113.
  3. If your Chrome version or/and operating system differs from above specs, you need to download the Chrome web driver from https://chromedriver.chromium.org/downloads and replace the "chromedriver" file in the cloned project.
  4. Open the project in your favorite IDE.
  5. If your operating system is Windows you need to edit the path to chromedriver. Change it from "./chromedriver" to "./chromedriver.exe"
  6. Enable assertions in your IDE.
  7. Execute the program. 
      
