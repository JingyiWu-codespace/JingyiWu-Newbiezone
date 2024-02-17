from name_function import get_formatted_name
def test_first_last_name():
    """测试： 能够处理姓名？"""
    formatted_name = get_formatted_name('jingyi','wu')
    assert formatted_name == 'Jingyi Wu'

def test_first_last_middle_name():
    """ Wolfgang Amadeus Mozart """
    formatted_name = get_formatted_name('Wolfgang', 'Mozart','Amadeus' )
    assert formatted_name == 'Wolfgang Amadeus Mozart'
