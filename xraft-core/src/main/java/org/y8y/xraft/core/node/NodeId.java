package org.y8y.xraft.core.node;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.concurrent.Immutable;

/**
 * @author Chen Bing
 * @since 2020/6/28
 */
@Immutable
public class NodeId implements Serializable {

  private final String value;

  public NodeId(@Nonnull String value) {
    Preconditions.checkNotNull(value);
    this.value = value;
  }

  public static NodeId of(@Nonnull String value) {
    return new NodeId(value);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeId nodeId = (NodeId) o;
    return value.equals(nodeId.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return "NodeId{" +
        "value='" + value + '\'' +
        '}';
  }

  @Nonnull
  public String getValue() {
    return value;
  }
}
