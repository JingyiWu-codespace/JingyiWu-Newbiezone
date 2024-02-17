class AnonymousSurvey:
    """收集匿名调查问卷的答案"""
    def __init__(self,question):
        """存储一个问题，为答案做准备"""
        self.question = question
        self.responses = []
    def show_question(self):
        """显示问题"""
        print(self.question)
    def store_response(self,new_response):
        self.responses.append(new_response)
    def show_result(self):
        print("Survey results: ")
        for response in self.responses:
            print(f"- {response}")

