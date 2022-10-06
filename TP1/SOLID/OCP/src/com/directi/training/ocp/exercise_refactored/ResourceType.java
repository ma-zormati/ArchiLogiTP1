package com.directi.training.ocp.exercise_refactored;

public abstract class ResourceType {
    public abstract void markSlotFree(int resourceId);
    public abstract void markSlotBusy(int resourceId);
    public abstract int findFreeSlot();
}

