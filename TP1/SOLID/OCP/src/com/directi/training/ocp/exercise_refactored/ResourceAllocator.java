package com.directi.training.ocp.exercise_refactored;

public class ResourceAllocator
{
    private static final int INVALID_RESOURCE_ID = -1;

    public int allocate(ResourceType resourceType)
    {
        int resourceId =INVALID_RESOURCE_ID ;
        resourceId = resourceType.findFreeSlot();
        resourceType.markSlotBusy(resourceId);
        return resourceId;
    }

    public void free(ResourceType resourceType, int resourceId)
    {
        resourceType.markSlotFree(resourceId);

    }

}
