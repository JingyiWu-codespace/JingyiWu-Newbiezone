from employee import Employee
import pytest
from employee import Employee
# def test_give_defalut_raise():
# employee_one = Employee('Jack','Ma',1000)
# assert employee_one.salary == 1000
# def test_give_custom_raise(num=''):
# employee_one = Employee('Jack', 'Ma', 1000)
# employee_one.give_raise()
# assert employee_one.salary == 6000
#
@pytest.fixture
def employee():
    employee = Employee('Jack','Ma',1000)
    return employee

def test_give_defalut_raise(employee):
    assert employee.salary == 1000
def test_give_custom_raise(employee):

    employee.give_raise(1000)
    assert employee.salary == 2000

