package org.y8y.xraft.core.node.role;

/**
 * @author Chen Bing
 * @since 2020/6/27
 */
abstract class AbstractNodeRole {

  private final RoleName name;

  protected final int term;

  public AbstractNodeRole(RoleName name, int term) {
    this.name = name;
    this.term = term;
  }

  public RoleName getName() {
    return name;
  }

  public int getTerm() {
    return term;
  }

  public abstract void cancelTimeoutOrTask();
}
