package com.linkedin.thirdeye.taskexecution.impl.operator;

import com.linkedin.thirdeye.taskexecution.dag.NodeIdentifier;
import com.linkedin.thirdeye.taskexecution.impl.dataflow.GenericInputPort;
import com.linkedin.thirdeye.taskexecution.dataflow.reader.InputPort;
import org.apache.commons.configuration.Configuration;


public abstract class Operator1x1<IN, OUT> extends Operator0x1<OUT> {
  private final InputPort<IN> inputPort;

  public Operator1x1(NodeIdentifier nodeIdentifier, Configuration configuration) {
    super(nodeIdentifier, configuration);
    inputPort = new GenericInputPort<>(nodeIdentifier);
  }

  public InputPort<IN> getInputPort() {
    return inputPort;
  }

  @Override
  public void initializeIOPorts() {
    super.initializeIOPorts();
    inputPort.initialize();
  }
}