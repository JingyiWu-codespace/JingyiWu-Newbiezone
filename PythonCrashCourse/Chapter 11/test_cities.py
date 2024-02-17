from city_function import city_function
def test_city_name():
    city = city_function('santiago','chile','5000000')
    assert city == 'Santiago, Chile - Population 5000000'
