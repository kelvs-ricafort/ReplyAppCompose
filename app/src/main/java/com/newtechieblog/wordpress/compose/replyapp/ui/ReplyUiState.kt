package com.newtechieblog.wordpress.compose.replyapp.ui

import com.newtechieblog.wordpress.compose.replyapp.data.Email
import com.newtechieblog.wordpress.compose.replyapp.data.MailboxType
import com.newtechieblog.wordpress.compose.replyapp.data.local.LocalEmailsDataProvider

data class ReplyUiState(
    val mailboxes: Map<MailboxType, List<Email>> = emptyMap(),
    val currentMailbox: MailboxType = MailboxType.Inbox,
    val currentSelectedEmail: Email = LocalEmailsDataProvider.defaultEmail,
    val isShowingHomepage: Boolean = true
) {
    val currentMailboxEmails: List<Email> by lazy { mailboxes[currentMailbox]!! }
}