import pytest
from ping_pong_game import PingPongGame

def test_game_starts():
    game = PingPongGame()
    assert game.get_score() == "0-0", "Game should start with score 0-0"

def test_player_one_scores():
    game = PingPongGame()
    game.player_one_scores()
    assert game.get_score() == "1-0", "Score should be 1-0 after player one scores"

# Add more tests as needed