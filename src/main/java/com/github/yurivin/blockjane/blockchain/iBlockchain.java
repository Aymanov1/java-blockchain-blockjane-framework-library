package com.github.yurivin.blockjane.blockchain;

import com.github.yurivin.blockjane.infrastracture.Environment;

public interface iBlockchain {

    /**
     * Method to add block in to blockchain.
     * Should return 'true' if all pending blocks successfully serialized or saved in cash memory.
     * Saving in cache memory may can lead to the loss of blocks when the system falls.
     * If there is some problem with serialization, blockchain works properly,
     * but serializes all pending block when it is possible.
     * @return
     */
    boolean newBlock();

    Environment setEnvironment(Environment env);

    /**
     * Method to check the integrity of blockchain
     * @return
     */
    Boolean isCachedChainValid();
}