package com.octoosmo.monitoring.disks;

public class DiskInfo {
    private String name;
    private String size;
    private String usedSpace;
    private String availableSpace;
    private String percentOfUse;
    private String mountPoint;

    public String getName() {
        return name;
    }

    public DiskInfo setName(String name) {
        this.name = name;
        return this;
    }

    public String getSize() {
        return size;
    }

    public DiskInfo setSize(String size) {
        this.size = size;
        return this;
    }

    public String getUsedSpace() {
        return usedSpace;
    }

    public DiskInfo setUsedSpace(String usedSpace) {
        this.usedSpace = usedSpace;
        return this;
    }

    public String getAvailableSpace() {
        return availableSpace;
    }

    public DiskInfo setAvailableSpace(String availableSpace) {
        this.availableSpace = availableSpace;
        return this;
    }

    public String getPercentOfUse() {
        return percentOfUse;
    }

    public DiskInfo setPercentOfUse(String percentOfUse) {
        this.percentOfUse = percentOfUse;
        return this;
    }

    public String getMountPoint() {
        return mountPoint;
    }

    public DiskInfo setMountPoint(String mountPoint) {
        this.mountPoint = mountPoint;
        return this;
    }

    @Override
    public String toString() {
        return getName() + " "
                + getSize() + " "
                + getUsedSpace() + " "
                + getAvailableSpace() + " "
                + getPercentOfUse() + " "
                + getMountPoint();
    }
}
