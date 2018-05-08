#include <bits/stdc++.h>
using namespace std;

struct Person {
   int id;
   int age;
   char name[50];
};

int main(){
struct Person person;
person.id =12;
person.age = 30;
strcpy(person.name, "Tim");

cout << "ID : " << person.id << endl ;
cout << "Age : " << person.age << endl ;
cout << "Name : " << person.name << endl ;

}
