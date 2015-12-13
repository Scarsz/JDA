package net.dv8tion.jda.entities.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import net.dv8tion.jda.entities.SelfInfo;
import net.dv8tion.jda.entities.TextChannel;

public class SelfInfoImpl extends UserImpl implements SelfInfo
{
    private final String email;
    private List<TextChannel> mutedChannels = new ArrayList<>();
    private boolean verified;

    public SelfInfoImpl(String id, String email)
    {
        super(id);
        this.email = email;
    }

    @Override
    public String getEmail()
    {
        return email;
    }

    @Override
    public List<TextChannel> getMutedChannels()
    {
        return Collections.unmodifiableList(mutedChannels);
    }

    @Override
    public boolean isVerified()
    {
        return verified;
    }

    public SelfInfoImpl setMutedChannels(List<TextChannel> mutedChannels)
    {
        this.mutedChannels = mutedChannels;
        return this;
    }

    public SelfInfoImpl setVerified(boolean verified)
    {
        this.verified = verified;
        return this;
    }

    public List<TextChannel> getMutedChannelsModifiable()
    {
        return mutedChannels;
    }

    @Override
    public boolean equals(Object o)
    {
        if (!(o instanceof SelfInfo))
            return false;
        SelfInfo oSelfInfo = (SelfInfo) o;
        return this == oSelfInfo || this.getId().equals(oSelfInfo.getId());
    }

    @Override
    public int hashCode()
    {
        return getId().hashCode();
    }
}