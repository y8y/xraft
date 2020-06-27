package org.y8y.xraft.core.node.role;

import javax.annotation.concurrent.Immutable;
import org.y8y.xraft.core.node.NodeId;
import org.y8y.xraft.core.schedule.ElectionTimeout;

/**
 * @author Chen Bing
 * @since 2020/6/28
 */
@Immutable
public class FollowerNodeRole extends AbstractNodeRole {

  private final NodeId votedFor;
  private final NodeId leaderId;
  private final ElectionTimeout electionTimeout;

  public FollowerNodeRole(int term, NodeId votedFor, NodeId leaderId,
      ElectionTimeout electionTimeout) {
    super(RoleName.FOLLOWER, term);
    this.votedFor = votedFor;
    this.leaderId = leaderId;
    this.electionTimeout = electionTimeout;
  }

  @Override
  public void cancelTimeoutOrTask() {

  }
}
