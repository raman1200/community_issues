# include <iostream>
using namespace std;

int main() {

  char op;
  float num1, num2;
  // Prompt the user to enter the operator
  cout << "Enter operator: +, -, *, /: ";
  cin >> op;
   // Prompt the user to enter two operands
  cout << "Enter two operands: ";
  cin >> num1 >> num2;

  switch(op) {

    case '+':
        // Addition operation
      cout << num1 << " + " << num2 << " = " << num1 + num2;
      break;

    case '-':
        // Subtraction operation
      cout << num1 << " - " << num2 << " = " << num1 - num2;
      break;

    case '*':
       // Multiplication operation
      cout << num1 << " * " << num2 << " = " << num1 * num2;
      break;

    case '/':
       // Division operation
      // Note: Make sure num2 is not zero to avoid division by zero error
     if(num2 != 0)
        cout << num1 << " / " << num2 << " = " << num1 / num2;
      else
        cout << "Error! Division by zero is not allowed";
      break;

    default:
      // If the operator is other than +, -, * or /, error message is shown
      cout << "Error! operator is not correct";
      break;
  }

  return 0;
}
I've added comments explaining each section of the code, including the purpose of user prompts, the operations being performed, and a note about avoiding division by zero error.





