package com.tradeshift.reaktive.actors;

/**
 * Base class for immutable classes that hold the state for an AbstractStatefulPersistentActor
 * 
 * @param E base class of all events that will affect this state
 * @param S concrete implementation of AbstractState (i.e. the name of your concrete AbstractState subclass itself)
 */
public abstract class AbstractState<E,S extends AbstractState<E,?>> {
    /**
     * Returns the state updated for the given event.
     */
    public abstract S apply(E event);
}