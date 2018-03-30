package com.github.yurivin.blockjane;

import com.github.yurivin.blockjane.block.Block;
import com.github.yurivin.blockjane.block.iBlock;
import com.github.yurivin.blockjane.infrastracture.Environment;
import com.github.yurivin.blockjane.transaction.iTransaction;
import com.github.yurivin.blockjane.transaction.inoutmodel.InOutTransaction;
import com.github.yurivin.blockjane.transaction.inoutmodel.TransactionOutput;
import com.github.yurivin.blockjane.wallet.PublicKeyWallet;
import com.github.yurivin.blockjane.wallet.iWallet;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.security.Security;

public class TestTransactions {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Test
    @Ignore
    public void test() {
        Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider()); //Setup Bouncey castle as a Security Provider
        Environment env = new Environment();
        //Create wallets:
        iWallet walletA = new PublicKeyWallet(env);
        iWallet walletB = new PublicKeyWallet(env);
        iWallet coinbase = new PublicKeyWallet(env);

        //create genesis transaction, which sends 100 NoobCoin to walletA:
        /*iTransaction genesisTransaction = new InOutTransaction(coinbase, walletA.getPublicKey(), new BigDecimal("100"), null, env);
        iTransaction genesisTransaction.generateSignature(coinbase.privateKey);	 //manually sign the genesis transaction
        iTransaction genesisTransaction.transactionId = "0"; //manually set the transaction id
        iTransaction genesisTransaction.outputs.add(new TransactionOutput(genesisTransaction.reciepient, genesisTransaction.value, genesisTransaction.transactionId)); //manually add the Transactions Output
        UTXOs.put(genesisTransaction.outputs.get(0).id, genesisTransaction.outputs.get(0)); //its important to store our first transaction in the UTXOs list.

        System.out.println("Creating and Mining Genesis block... ");
        iBlock genesis = new Block("0");
        genesis.addTransaction(genesisTransaction);
        addBlock(genesis);

        //testing
        Block block1 = new Block(genesis.hash);
        System.out.println("\nWalletA's balance is: " + walletA.getBalance());
        System.out.println("\nWalletA is Attempting to send funds (40) to WalletB...");
        block1.addTransaction(walletA.sendFunds(walletB.publicKey, 40f));
        addBlock(block1);
        System.out.println("\nWalletA's balance is: " + walletA.getBalance());
        System.out.println("WalletB's balance is: " + walletB.getBalance());

        Block block2 = new Block(block1.hash);
        System.out.println("\nWalletA Attempting to send more funds (1000) than it has...");
        block2.addTransaction(walletA.sendFunds(walletB.publicKey, 1000f));
        addBlock(block2);
        System.out.println("\nWalletA's balance is: " + walletA.getBalance());
        System.out.println("WalletB's balance is: " + walletB.getBalance());

        Block block3 = new Block(block2.hash);
        System.out.println("\nWalletB is Attempting to send funds (20) to WalletA...");
        block3.addTransaction(walletB.sendFunds( walletA.publicKey, 20));
        System.out.println("\nWalletA's balance is: " + walletA.getBalance());
        System.out.println("WalletB's balance is: " + walletB.getBalance());*/
    }
}