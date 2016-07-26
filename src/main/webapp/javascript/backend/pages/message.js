/* ========================================================================
 * message.js
 * Page/renders: page-message.html
 * Plugins used: magnific-popup, gritter, selectize
 * ======================================================================== */

'use strict';

(function (factory) {
    if (typeof define === 'function' && define.amd) {
        define([
            'magnific',
            'shuffle',
            'selectize',
            'gritter'
        ], factory);
    } else {
        factory();
    }
}(function () {

    $(function () {
        // Gritter
        // ================================
        setTimeout(function () {
            $.gritter.add({
                title: 'You have (14) unread message',
                text: 'This will fade out after a certain amount of time. Vivamus eget tincidunt velit.',
                sticky: false
            });
        }, 3000);

        // Magnific Popup
        // ================================
        $('#photo-album').magnificPopup({
            delegate: '.magnific',
            type: 'image',
            gallery: {
                enabled: true
            }
        });

        // Contact select
        // ================================
        (function () {
            var REGEX_EMAIL = '([a-z0-9!#$%&*+/=?^_`{|}~-]+(?:[a-z0-9!#$%&*+/=?^_`{|}~-]+)*@' + '(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?)';

            var formatName = function (item) {
                return $.trim((item.firstName || '') + ' ' + (item.lastName || ''));
            };
            // contact
            $('#selectize-contact').selectize({
                persist: false,
                maxItems: null,
                valueField: 'email',
                labelField: 'name',
                searchField: ['firstName', 'lastName', 'email'],
                sortField: [{
                    field: 'firstName',
                    direction: 'asc'
                }, {
                    field: 'lastName',
                    direction: 'asc'
                }],
                options: [{
                    email: 'nikola@tesla.com',
                    firstName: 'Nikola',
                    lastName: 'Tesla'
                }, {
                    email: 'brian@thirdroute.com',
                    firstName: 'Brian',
                    lastName: 'Reavis'
                }, {
                    email: 'pampersdry@gmail.com',
                    firstName: 'John',
                    lastName: 'Pozy'
                }],
                render: {
                    item: function (item, escape) {
                        var name = formatName(item);
                        return '<div>' +
                            (name ? '<span class="name">' + escape(name) + '</span>' : '') +
                            (item.email ? '<small class="text-muted ml10">' + escape(item.email) + '</small>' : '') +
                            '</div>';
                    },
                    option: function (item, escape) {
                        var name = formatName(item);
                        var label = name || item.email;
                        var caption = name ? item.email : null;
                        return '<div>' +
                            '<span class="text-primary">' + escape(label) + '</span><br/>' +
                            (caption ? '<small class="text-muted">' + escape(caption) + '</small>' : '') +
                            '</div>';
                    }
                },
                create: function (input) {
                    if ((new RegExp('^' + REGEX_EMAIL + '$', 'i')).test(input)) {
                        return {
                            email: input
                        };
                    }
                    var match = input.match(new RegExp('^([^<]*)<' + REGEX_EMAIL + '>$', 'i'));
                    if (match) {
                        var name = $.trim(match[1]);
                        var posSpace = name.indexOf(' ');
                        var firstName = name.substring(0, posSpace);
                        var lastName = name.substring(posSpace + 1);

                        return {
                            email: match[2],
                            firstName: firstName,
                            lastName: lastName
                        };
                    }
                    return false;
                }
            });
        })();
    });

}));