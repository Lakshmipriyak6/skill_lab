// Singleton class to manage the game state
class GameState {
    private static GameState instance;
    private int level;
    private int score;

    private GameState() {
        this.level = 1;
        this.score = 0;
    }

    // Get the single instance of the game state
    public static GameState getInstance() {
        if (instance == null) {
            instance = new GameState();
        }
        return instance;
    }

    // Getters and setters for level and score
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void increaseScore(int points) {
        this.score += points;
        System.out.println("Score increased by " + points + ". Total score: " + score);
    }
}
