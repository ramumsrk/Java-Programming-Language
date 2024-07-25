package com.gitconnected.levelup.java_comparavle_interface._002_Setup;

import java.math.BigDecimal;

/**
 * @author ramumsrk
 * @since 2024/07/26
 * @param purchaseTransactionId
 * @param paymentType
 * @param amountPaid
 * @param cashBack
 */
public record PurchaseTransactionRecord(String purchaseTransactionId, PaymentType paymentType, BigDecimal amountPaid,
int cashBack) {
}
