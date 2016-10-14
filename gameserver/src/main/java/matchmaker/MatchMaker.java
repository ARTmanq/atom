package matchmaker;

//import com.jetbrains.annotations.NotNull;

import com.sun.istack.internal.NotNull;
import model.GameSession;
import model.Player;

import java.util.List;

/**
 * Provides (searches or creates) {@link GameSession} for {@link Player}
 *
 * @author Alpi
 */
public interface MatchMaker {
  /**
   * Searches available game session or creates new one
   * @param player player to join the game session
   */
  void joinGame(@NotNull Player player);

  /**
   * @return Currently open game sessions
   */
  @NotNull
  List<GameSession> getActiveGameSessions();
}
