"use strict";
exports.__esModule = true;
var Employee = /** @class */ (function () {
    function Employee(id, name, dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }
    return Employee;
}());
exports.Employee = Employee;
var emp = new Employee(1, 'Sowmya', new Date());
console.log('Name:' + emp.name);
console.log('ID :' + emp.id);
console.log('Date of Birth :' + emp.dob);
