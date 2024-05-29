class PingPongGame:
    def __init__(self):
        self.score = [0, 0]  # [player_one_score, player_two_score]

    def player_one_scores(self):
        self.score[0] += 1

    def player_two_scores(self):
        self.score[1] += 1

    def get_score(self):
        return f"{self.score[0]}-{self.score[1]}"